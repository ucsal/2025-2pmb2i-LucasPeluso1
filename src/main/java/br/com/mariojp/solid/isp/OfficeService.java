package br.com.mariojp.solid.isp;

public class OfficeService implements Print{
    private final MultiFunctionDevice device;
    public OfficeService(MultiFunctionDevice device){ this.device = device; }
	@Override
	public void printReport(String content) {
		// TODO Auto-generated method stub
		device.print(content);
	}
}
