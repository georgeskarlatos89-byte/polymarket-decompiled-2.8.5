package com.checkout.components.core.network.adapter;

import com.checkout.components.core.network.model.response.ErrorResponse;
import defpackage.d1c;
import defpackage.dp8;
import defpackage.x3j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/network/adapter/ErrorResponseAdapter;", "", "", "", "json", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "fromJson", "(Ljava/util/Map;)Lcom/checkout/components/core/network/model/response/ErrorResponse;", "errorResponse", "toJson", "(Lcom/checkout/components/core/network/model/response/ErrorResponse;)Ljava/util/Map;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorResponseAdapter {
    @dp8
    public final ErrorResponse fromJson(Map<String, ? extends Object> json) {
        String str;
        String str2;
        List list;
        json.getClass();
        Object obj = json.get("request_id");
        ArrayList arrayList = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = json.get("error_type");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = json.get("error_codes");
        if (obj3 instanceof List) {
            list = (List) obj3;
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof String) {
                    arrayList.add(obj4);
                }
            }
        }
        return new ErrorResponse(str, str2, arrayList);
    }

    @x3j
    public final Map<String, Object> toJson(ErrorResponse errorResponse) {
        errorResponse.getClass();
        return d1c.e(new Pair("request_id", errorResponse.requestId), new Pair("error_type", errorResponse.errorType), new Pair("error_codes", errorResponse.errorCodes));
    }
}
