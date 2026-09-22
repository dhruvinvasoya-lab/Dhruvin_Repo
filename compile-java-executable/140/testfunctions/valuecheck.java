class valuecheck {

	public static void valuecheck() {
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
		tg_int var_count = 5;
		tg.check.isEqualTo(var_count,5);
		tg.check.isNotEqualTo(var_count,3);
		tg.check.isGreaterThanOrEqualTo(var_count,4);
		tg.check.isLessThanOrEqualTo(var_count,7);
		tg.check.isGreaterThan(var_count,1);
		tg.check.isLessThan(var_count,6);
	}
}