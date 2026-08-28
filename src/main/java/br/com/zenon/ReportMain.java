package br.com.zenon;
import br.com.zenon.TransactionReport.Statistics;

public class ReportMain {
    public static void main(String[] args) {

        TransactionReport transactionReport = new TransactionReport();
        Statistics totalTransactions = transactionReport.genererateReport("data/PS_20174392719_1491204439457_log.csv");

        System.out.println("Total de linhas: "+totalTransactions.totalTransactions());
        System.out.println("Total amount: "+totalTransactions.totalAmount());
        System.out.println("Total Frauds: "+totalTransactions.totalFrauds());
    }
}
