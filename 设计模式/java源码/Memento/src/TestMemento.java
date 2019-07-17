
public class TestMemento {
	public static void main(String[] args) {
		//大战前
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		//保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.saveState());
		//大战boss，损耗严重
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		//恢复之前状态
		lixiaoyao.recoveryState(stateAdmin.getMemento());
		lixiaoyao.stateDisplay();
	}
}
