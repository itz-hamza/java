interface Add{
    void sayHello(String name);
}

class FunctionalInterface{
    
        public static void main(String args[])
        {   
            Add add = (String name)->{System.out.println(name);};

            add.sayHello("hamza");
        }
}
