/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b0;

import jp.co.ntt.atrs.domain.model.FlightType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 予約フライト選択フォーム。
 * 
 * @author NTT 電電次郎
 */
public class ReservationFlightForm implements IReservationFlightForm, Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 7963739920383932182L;

    /**
     * フライト種別。
     */
    @NotNull
    private FlightType flightType;

    /**
     * 選択フライト情報フォームのリスト。
     */
    @Valid
    private List<SelectFlightForm> selectFlightFormList = new ArrayList<>();

    /**
     * フライト種別を取得する。
     * 
     * @return フライト種別
     */
    @Override
    public FlightType getFlightType() {
        return flightType;
    }

    /**
     * フライト種別を設定する。
     * 
     * @param flightType フライト種別
     */
    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    /**
     * 選択フライト情報フォームのリストを取得する。
     * 
     * @return 選択フライト情報フォームのリスト
     */
    @Override
    public List<SelectFlightForm> getSelectFlightFormList() {
        return selectFlightFormList;
    }

    /**
     * 選択フライト情報フォームのリストを設定する。
     * 
     * @param selectFlightFormList 選択フライト情報フォームのリスト
     */
    public void setSelectFlightFormList(List<SelectFlightForm> selectFlightFormList) {
        this.selectFlightFormList = selectFlightFormList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
