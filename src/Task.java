
public class Task implements Runnable {

	volatile boolean stop = false;
	private int runcount = 0;
	private int taskId;

	public Task(int taskId) {
		super();
		this.taskId = taskId;
		System.out.println("Create TaskId:"+taskId);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(++runcount == 3)
				stop = true;
			
			System.out.println("Current Thread :"+Thread.currentThread().toString()
					+":TaskId:"+taskId+":count:"+runcount);
		}

	}

}
