package com.ruoyi.web.request;

import com.ruoyi.base.ApiRuleException;
import com.ruoyi.base.BaseTaobaoRequest;
import com.ruoyi.web.business.U9ApiBusiness;
import com.ruoyi.web.response.CreateShipSVResponse;

import java.util.Map;

public class CreateShipSVRequest extends BaseTaobaoRequest<CreateShipSVResponse> {

    public u9api.vo.ErpShipVO vo;
    @Override
    public String getApiMethodName() {
        return null;
    }

    @Override
    public Map<String, String> setParams() {
        u9api.domain.ErpShip dto  = new u9api.domain.ErpShip();

        return null;
    }

    @Override
    public String doService() throws Exception{

        return U9ApiBusiness.CreateShipSVStub();
    }

    @Override
    public Class<CreateShipSVResponse> getResponseClass() {
        return CreateShipSVResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }
}
