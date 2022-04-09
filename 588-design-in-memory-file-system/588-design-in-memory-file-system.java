class FileSystem {
    class Directory{
        String name;
        Map<String,String> files = new HashMap<>();
        Map<String,Directory> subdirectory= new HashMap<>();
    }
    
    
    /*
        Store file in HashMap
    */
    Queue<Directory> system = new LinkedList<>();
    Directory root;
    public FileSystem() {
       root = new Directory();
    }
    
    public List<String> ls(String path) {
        String[] split = path.split("/");
        
        Directory temp = root;
        for(String dir: split){
            if(dir.isBlank() || dir.isEmpty()) continue;
            if(temp.subdirectory.containsKey(dir)){
                temp = temp.subdirectory.get(dir);
            }
            else{
                return Arrays.asList(dir);
            }
        }
        List<String> ret = new ArrayList<>();
        for(String key: temp.files.keySet()){
            ret.add(key);
        }
        for(String key: temp.subdirectory.keySet()){
            ret.add(key);
        }
        Collections.sort(ret);
        return ret;
    }
    
    public void mkdir(String path) {
        String[] split = path.split("/");
        Directory temp = root;
        for(int i=1;i<split.length;i++){
            if(!temp.subdirectory.containsKey(split[i])){
                temp.subdirectory.put(split[i], new Directory());
            }
            temp = temp.subdirectory.get(split[i]);
        }
    }
    
    public void addContentToFile(String filePath, String content) {
        String[] split = filePath.split("/");
        Directory temp = root;
        for(String dir: split){
            if(dir.isBlank() || dir.isEmpty()) continue;
            if(temp.subdirectory.containsKey(dir)){
                temp = temp.subdirectory.get(dir);
            }
            else{
                 temp.files.put(dir, temp.files.getOrDefault(dir, new String()) + content);
            }
        }
    }
    
    public String readContentFromFile(String filePath) {
        String[] split = filePath.split("/");
        Directory temp = root;
        for(String dir: split){
            if(dir.isBlank() || dir.isEmpty()) continue;
            if(temp.subdirectory.containsKey(dir)){
                temp = temp.subdirectory.get(dir);
            }
            else{
                 return temp.files.get(dir);
            }
        }
        return "";
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */