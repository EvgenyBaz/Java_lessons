 package lesson06;

 public class cat {



    Integer catId;
    String catName;
    Integer catAge;  
    boolean catChip = false;
    boolean catAlive = true;


    public void getAge() {

        System.out.printf("коту %s %d лет \n", this.catName, this.catAge);
        
    }

    public void addChip() {

        if(this.catChip) {
            System.out.printf(" %s уже чипирован \n", this.catName);
        }
        else{
            this.catChip = true;
            System.out.printf("теперь %s чипирован \n", this.catName);
        }
    
    
    }

    public boolean catAliveCheck() {
        return catAlive;
    }






    
 }


// 