package scu.wcc.test1;

public class Test {
    public static void main(String[] args){
        Role r1 = new Role("徐志摩", 100,'男');
        Role r2 = new Role("摩达", 100,'女');

//        r1.showRoleInfo();
//        r2.showRoleInfo();

        while(true){
            r1.attack(r2);
            int bleed2 = r2.getBlood();
            if(bleed2==0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;
            }

            r2.attack(r1);
            int bleed1 = r1.getBlood();
            if(bleed1==0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }
        }
    }
}
