package Sklad;

import java.util.List;

public interface ISkald {
	public void zarediSklad(List<Stoka> listStoki);
	public void dostavi(Magazin magazin, List<Stoka> stoki);
	public void topStoki();
	public void loshiSlujiteli();
	public void dificitniStoki();
	public void statistikaProdajbi();
	public void statistikaPokupki();
	public void parichenBalans();
}
