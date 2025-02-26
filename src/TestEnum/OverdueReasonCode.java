package TestEnum;


public enum OverdueReasonCode {

    EMPTY("", " "),
    FINANCIAL_ISSUE("FI", "Financial Issue 財務問題,資金緊張"),
    HABIT_DELAY("HP", "Habit of Delaying Payment 慣性拖款"),
    PAYMENT_IN_THIS_MONTH("PM", "Payment within This Month(Overdue &lt; 30 days) 逾期30天內,本月付款"),
    DIFFERENT_CUTOFF("DD", "Different Cut-off Date 跨月帳款"),
    PAYMENT_RECEIVED("PR", "Payment Received 已收款"),
    QUALITY_ISSUE("QI", "Quality Issue 品質問題"),
    PRICE_GAP("PI", "Price Gap Issue 價差"),
    DIFFERENT_DEFINITION("DT", "Different Definition of Payment Terms 付款條件認知不同"),
    OTHERS("99", "Others 其他");

    private String desc;
    private String code;

    private OverdueReasonCode(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public static String getDescByCode(String code) {
        for (OverdueReasonCode o : OverdueReasonCode.values()) {
            if (o.code.equals(code)) {
                return o.desc;
            }
        }
        return null;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getCode() {
        return code;
    }
}
