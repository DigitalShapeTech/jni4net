// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.tutorials.banking;

@net.sf.jni4net.attributes.ClrType
public class AllocatedCashflow extends org.drools.tutorials.banking.TypedCashflow {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected AllocatedCashflow(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("()V")
    public AllocatedCashflow() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        org.drools.tutorials.banking.AllocatedCashflow.__ctorAllocatedCashflow0(this);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("(Lorg/drools/tutorials/banking/Account;LSystem/String;ID)V")
    public AllocatedCashflow(org.drools.tutorials.banking.Account account, java.lang.String date, int type, double amount) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        org.drools.tutorials.banking.AllocatedCashflow.__ctorAllocatedCashflow1(this, account, date, type, amount);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("(Lorg/drools/tutorials/banking/Account;LSystem/DateTime;ID)V")
    public AllocatedCashflow(org.drools.tutorials.banking.Account account, system.DateTime date, int type, double amount) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        org.drools.tutorials.banking.AllocatedCashflow.__ctorAllocatedCashflow2(this, account, date, type, amount);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    private native static void __ctorAllocatedCashflow0(net.sf.jni4net.inj.IClrProxy thiz);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/tutorials/banking/Account;Ljava/lang/String;ID)V")
    private native static void __ctorAllocatedCashflow1(net.sf.jni4net.inj.IClrProxy thiz, org.drools.tutorials.banking.Account account, java.lang.String date, int type, double amount);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/tutorials/banking/Account;Lsystem/DateTime;ID)V")
    private native static void __ctorAllocatedCashflow2(net.sf.jni4net.inj.IClrProxy thiz, org.drools.tutorials.banking.Account account, system.DateTime date, int type, double amount);
    
    @net.sf.jni4net.attributes.ClrMethod("()Lorg/drools/tutorials/banking/Account;")
    public native org.drools.tutorials.banking.Account getAccount();
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/tutorials/banking/Account;)V")
    public native void setAccount(org.drools.tutorials.banking.Account value);
    
    public static system.Type typeof() {
        return org.drools.tutorials.banking.AllocatedCashflow.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.tutorials.banking.AllocatedCashflow.staticType = staticType;
    }
    //</generated-proxy>
}