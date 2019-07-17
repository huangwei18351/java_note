package WebSite;

public class TESTWebsiteFlyWeight {
	public static void main(String[] args) {
		WebSiteFactory wf = new WebSiteFactory();
		
		WebSite wx = wf.getWebSiteCategory("产品展示");
		wx.use(new User("小菜"));
		
		WebSite wt = wf.getWebSiteCategory("产品展示");
		wt.use(new User("大鸟"));
		
		WebSite wz = wf.getWebSiteCategory("产品展示");
		wz.use(new User("娇娇"));
		
		WebSite w1 = wf.getWebSiteCategory("博客");
		w1.use(new User("老顽童"));
		
		WebSite w2 = wf.getWebSiteCategory("博客");
		w2.use(new User("大米"));
		System.out.println("得到网站分类总数：" + wf.getWebSiteCount());
		
	}
}
