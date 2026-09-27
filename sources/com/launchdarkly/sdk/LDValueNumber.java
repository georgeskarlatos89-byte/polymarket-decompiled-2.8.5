package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.fva;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueNumber extends LDValue {
    private static final LDValueNumber ZERO = new LDValueNumber(ConstantsKt.UNSET);
    private final double value;

    public LDValueNumber(double d) {
        this.value = d;
    }

    public static LDValueNumber t(double d) {
        if (d == ConstantsKt.UNSET) {
            return ZERO;
        }
        return new LDValueNumber(d);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final double b() {
        return this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.NUMBER;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final int f() {
        return (int) this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final boolean g() {
        if (this.value == ((int) r0)) {
            return true;
        }
        return false;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final long l() {
        return (long) this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final String q() {
        boolean g = g();
        double d = this.value;
        if (g) {
            return String.valueOf((int) d);
        }
        return String.valueOf(d);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        boolean g = g();
        double d = this.value;
        if (g) {
            jsonWriter.value((int) d);
        } else {
            jsonWriter.value(d);
        }
    }
}
