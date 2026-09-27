package com.google.android.libraries.places.api.model.kotlin;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.libraries.places.api.model.Money;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"money", "Lcom/google/android/libraries/places/api/model/Money;", AppsFlyerProperties.CURRENCY_CODE, "", "units", "", "nanos", "", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoneyKt {
    public static final Money money(String str, long j, int i) {
        str.getClass();
        Money newInstance = Money.newInstance(str, Long.valueOf(j), Integer.valueOf(i));
        newInstance.getClass();
        return newInstance;
    }
}
