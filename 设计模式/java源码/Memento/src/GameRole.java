
public class GameRole {
	private int vitality;
	private int attack;
	private int defense;
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	//状态显示
	public void stateDisplay(){
		System.out.println("角色当前状态：");
		System.out.println("体力：" + this.vitality);
		System.out.println("攻击力：" + this.attack);
		System.out.println("防御力：" + this.defense);
	}
	
	//获得初始状态
	public void getInitState(){
		this.vitality = 100;
		this.attack = 100;
		this.defense = 100;
	}
	
	//战斗
	public void fight(){
		this.vitality = 0;
		this.attack = 0;
		this.defense = 0;
	}
	
	//保存角色状态
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vitality, attack, defense);
	}
	
	//恢复角色状态
	public void recoveryState(RoleStateMemento memento){
		this.vitality = memento.getVitality();
		this.attack = memento.getAttack();
		this.defense = memento.getDefense();
	}
}
