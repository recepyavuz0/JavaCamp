package concreate;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya oluþturuldu.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya güncellendi.");
		
	}

}
