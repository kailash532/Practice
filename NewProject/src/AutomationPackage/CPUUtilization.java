package AutomationPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class CPUUtilization {
	
	private static void printUsage() {
		  OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		  for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
		    method.setAccessible(true);
		    if (method.getName().startsWith("get")
		        && Modifier.isPublic(method.getModifiers())) {
		            Object value;
		        try {
		            value = method.invoke(operatingSystemMXBean);
		        } catch (Exception e) {
		            value = e;
		        } // try
		        System.out.println(method.getName() + " = " + value);
		    } // if
		  } // for
		}
	
	public void getProcesses(){
		try {
		    String line;
		    Process p = Runtime.getRuntime().exec
		    	    (System.getenv("windir") +"\\system32\\"+"tasklist.exe");
		    BufferedReader input =
		            new BufferedReader(new InputStreamReader(p.getInputStream()));
		    while ((line = input.readLine()) != null) {
		        System.out.println(line); //<-- Parse data here.
		    }
		    input.close();
		} catch (Exception err) {
		    err.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CPUUtilization cs=new CPUUtilization();
	//	cs.printUsage();
		cs.getProcesses();
	}

}
