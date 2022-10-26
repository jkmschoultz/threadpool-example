public class Job implements Runnable {
	private int jobNumber;

	/**
	 * Initialise a new job
	 * 
	 * @param jobNumber  Number of the job
	 */
 	Job (int jobNumber) {
 		this.jobNumber = jobNumber;
 	}

	/**
	 * Emulate a job running by putting thread to sleep for 1 second
	 */
 	public void run () {
 	// Undertake required work, here we will emulate it by sleeping for a period
	 System.out.println ("Job: " + jobNumber + " is being processed by thread : "
 		+ Thread.currentThread ().getName());
 	try {
 		Thread.sleep((int)(1000));
 	} catch (InterruptedException e) {
 		// no catching as example should not experience interruptions
 	}
 	System.out.println("Job: " + jobNumber + " is ending in thread : "
 		+ Thread.currentThread().getName());
   }

}
