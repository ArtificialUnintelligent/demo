package com.artificialunintelligent.demo;

import com.artificialunintelligent.demo.proxy.WorkProxy;
import com.artificialunintelligent.demo.proxy.Worker;
import com.artificialunintelligent.demo.proxy.WorkerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtificialUnintelligentApplicationTests {

	@Test
	public void contextLoads() {
		Worker worker = new WorkerImpl();
		worker.doWork();
		Worker worker1 = new WorkProxy(worker);
		worker1.doWork();
	}
}

