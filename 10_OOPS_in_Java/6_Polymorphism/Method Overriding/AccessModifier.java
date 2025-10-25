/* 
- If we're performing Method Overriding then we can increase scope of Overridden method in Sub-Class using higher-scope access modifiers.
- Example:
    - if overridden method has default scope then we can use protected, public scope in Overridded method.
- Scope precidence : private < default < protected < public.
Note : private method cannot be overridden in sub-class.
*/

package methodor;

class SuperClassAM{
    // below method cannot be override because it has the private access and scope.
    /*
    private void sayHello(){
        System.out.println("This is method of Super Class: Overridden method.");
    }
    */

    void sayHello(){
        System.out.println("This is method of Super Class: Overridden method.");
    }
}

class SubClassAM extends SuperClassAM{
    @Override
    protected void sayHello(){
        System.out.println("This is method of Sub Class: Overridded method.");
    }
};

class AccessModifier{
    public static void main(String[] args){
        SubClassAM object = new SubClassAM();

        object.sayHello();
    }
};