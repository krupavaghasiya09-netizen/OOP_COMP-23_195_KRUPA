class VotingApp {

       void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {

        VotingApp v = new VotingApp();

        int[] ages = {16, 28, 10, 25}; 

        for (int age : ages) {
            try {
                System.out.println("Checking age: " + age);
                v.checkEligibility(age);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Validation process completed");
                System.out.println();
            }
        }
    }
}
