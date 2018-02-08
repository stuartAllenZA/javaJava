import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class BankersAlgorithmMain {
    public static void main(String[] args) {
        String fileContents;
        ArrayList<String> resourcesPerProcess = new ArrayList<>();
        DataFormatter dataFormatter = new DataFormatter();
        ArrayList<Process> processes = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((fileContents = bufferedReader.readLine()) != null) {
                resourcesPerProcess.add(fileContents);
            }

            for (String line : resourcesPerProcess) {
                processes.add(new Process(dataFormatter.formatStringToInts(line)));
            }

            processes.get(0).setAvs((args.length == 2) ? dataFormatter.formatStringToInts(args[1]) : new int[3]);
            int i = processes.size();

            while (i > 0) {
                for (Process subProcess : processes) {
                    if (!subProcess.getFlag()) {
                        int[] runningAvs = subProcess.getAvs();
                        subProcess.setFlag(((((subProcess.getA() + runningAvs[0]) >= subProcess.getaR())
                                && ((subProcess.getB() + runningAvs[1])) >= subProcess.getbR())
                                && ((subProcess.getC() + runningAvs[2]) >= subProcess.getcR())));
                        subProcess.updateAvs();
                        if (subProcess.getFlag())
                            System.out.print(subProcess.getName() + " ");
                    }
                }
            }
        } catch (IOException | ArrayIndexOutOfBoundsException ignored) {
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }
}
