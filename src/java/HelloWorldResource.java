public static AtomicInteger atomicInteger = new AtomicInteger();

@Resource("/hello-world", parameter="name")
public static function helloWorldRequest(String name) {
	// R to fill out
	return Greeting(atomicInteger.incrementAndGet(), name);
}
