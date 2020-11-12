package com.ruoyi.base;

public class DefaultClient {

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws ApiException {
        long start = System.currentTimeMillis();
        try {
            request.check();
        } catch (ApiRuleException e) {
            T localResponse = null;
            try {
                localResponse = request.getResponseClass().newInstance();
            } catch (Exception xe) {
                throw new ApiException(xe);
            }
            localResponse.setErrorCode(e.getErrCode());
            localResponse.setMsg(e.getErrMsg());
            return localResponse;
        }

        String rsp=null;
        try {
            rsp = request.doService();
        } catch (Exception e) {
            throw new ApiException(e);
        }

        T tRsp  = null;
        try {
            tRsp = request.getResponseClass().newInstance();
            tRsp.setBody(rsp);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return tRsp;
    }


}
