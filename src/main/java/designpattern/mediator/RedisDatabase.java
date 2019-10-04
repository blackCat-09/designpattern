package designpattern.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * DATE 2019-09-01 Redis 具体同事类
 * 
 *
 */
public class RedisDatabase extends AbstractDatabase {

	private List<String> dataset = new LinkedList<String>();

	public RedisDatabase(AbstractMediator mediator) {
		super(mediator);
	}

	@Override
	public void addData(String data) {
		System.out.println("Redis 添加数据：" + data);
		this.dataset.add(data);
	}

	@Override
	public void add(String data) {
		addData(data);
		// 数据同步作业交给中介者管理
		this.mediator.sync(AbstractDatabase.REDIS, data);
	}

	public void cache() {
		System.out.println("Redis 缓存的数据：" + this.dataset.toString());
	}
}
