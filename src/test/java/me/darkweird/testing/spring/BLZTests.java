package me.darkweird.testing.spring;

import generated.generated.DetailsType;
import me.darkweird.testing.data.BLZDao;
import me.darkweird.testing.model.BLZ;
import me.darkweird.testing.service.BlzCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

public class BLZTests extends SpringBaseTest {

    @Autowired
    BlzCodeService blzCodeService;

    @Autowired
    BLZDao dao;

    @Test
    public void test() throws SQLException {
        List<BLZ> list = dao.getBLZs();
        BLZ blz = list.get(0);
        DetailsType detailsType = blzCodeService.getBank(blz.getBlzCode());
        Assert.assertEquals(detailsType.getBezeichnung(), blz.getName());
        Assert.assertEquals(detailsType.getBic(), blz.getBic());
        Assert.assertEquals(detailsType.getOrt(), blz.getOrt());
        Assert.assertEquals(detailsType.getPlz(), blz.getPlz());
    }

    @Test
    public void test2() throws SQLException {
        BLZ blz = dao.getFirstBLZ();
        DetailsType detailsType = blzCodeService.getBank(blz.getBlzCode());
        Assert.assertEquals(detailsType.getBezeichnung(), blz.getName());
        Assert.assertEquals(detailsType.getBic(), blz.getBic());
        Assert.assertEquals(detailsType.getOrt(), blz.getOrt());
        Assert.assertEquals(detailsType.getPlz(), blz.getPlz());
    }
}
