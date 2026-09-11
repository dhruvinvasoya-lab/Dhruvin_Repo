class toolsqatestfunction {
	public static void toolsqatestfunction() {
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.click("ele_CardElements");
		tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuTextBox");
		tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
		tg.type("ele_TextBoxuserName", "Test1");
		tg_String var_Email = "";
		var_Email = tg.saveToVariable("test@test.com", var_Email);
		tg.type("ele_TextBoxEmail", var_Email);
		tg.wait(5);
	}
}