package com.aerosync.bank_link_sdk;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/aerosync/bank_link_sdk/EnvironmentType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STAGE", "SANDBOX", "PROD", "bank-link-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public enum EnvironmentType {
    STAGE("https://staging-sync.aero.inc/"),
    SANDBOX("https://sandbox.aerosync.com/"),
    PROD("https://sync.aero.inc/");

    private final String value;

    EnvironmentType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
