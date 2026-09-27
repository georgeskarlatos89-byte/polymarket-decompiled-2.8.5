package com.launchdarkly.sdk.android;

import com.google.gson.annotations.JsonAdapter;
import defpackage.sua;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDFailureSerialization.class)
/* loaded from: classes3.dex */
public class LDInvalidResponseCodeFailure extends LDFailure {
    private final int responseCode;
    private final boolean retryable;

    public LDInvalidResponseCodeFailure(Exception exc, int i, boolean z) {
        super("Unexpected Response Code From Stream Connection", exc, sua.UNEXPECTED_RESPONSE_CODE);
        this.responseCode = i;
        this.retryable = z;
    }

    public final int b() {
        return this.responseCode;
    }

    public final boolean c() {
        return this.retryable;
    }

    public LDInvalidResponseCodeFailure(String str, int i, boolean z) {
        super(str, sua.UNEXPECTED_RESPONSE_CODE);
        this.responseCode = i;
        this.retryable = z;
    }
}
