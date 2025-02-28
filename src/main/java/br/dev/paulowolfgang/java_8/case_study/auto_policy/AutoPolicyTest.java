package br.dev.paulowolfgang.java_8.case_study.auto_policy;

/**
 *
 * @author Paulo Silva
 */
public class AutoPolicyTest {
    public static void main(String[] args) {
        
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Corolla", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
        
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The Auto Policy");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
        (policy.isNoFaultState() ? "is": "is not"));
    }
}
