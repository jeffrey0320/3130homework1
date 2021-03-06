// Jeffrey Lopez
public class main {
    public static void main(String[] args) {
        Contact newContact = new Contact("Ari","Mermelstein","(718) 111-1111","2900 Bedford Avenue","Brooklyn","NY");
        Contact two = new Contact("John","Brook","(718) 111-1111","2900 Bedford Avenue","Brooklyn","NY");
        Contact three = new Contact("John","Arook","(518) 131-2461","3900 Bedford Avenue","Albany","NY");
        Contact four = new Contact("John","Brook","(718) 111-1111","2900 Bedford Avenue","Brooklyn","NY");
        System.out.println(newContact.toString() + "\n");
        System.out.println(newContact.equals(two));
        System.out.println(two.equals(three));
        System.out.println(two.equals(four)+ "\n");
        System.out.println(three.toString());
        three.updateInfo("Ben","monroe","(347) 432-1111","89 Virginia Street","Smithtown","NY");
        System.out.println();
        System.out.println(three.toString());
    }
}
