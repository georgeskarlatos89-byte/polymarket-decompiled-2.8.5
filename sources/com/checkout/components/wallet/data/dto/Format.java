package com.checkout.components.wallet.data.dto;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/wallet/data/dto/Format;", "", "MIN", "FULL", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Format {
    public static final Format FULL;
    public static final Format MIN;
    private static final /* synthetic */ Format[] a;
    private static final /* synthetic */ ug7 b;

    static {
        Format format = new Format("MIN", 0);
        MIN = format;
        Format format2 = new Format("FULL", 1);
        FULL = format2;
        Format[] formatArr = {format, format2};
        a = formatArr;
        b = new wg7(formatArr);
    }

    private Format(String str, int i) {
    }

    public static ug7 getEntries() {
        return b;
    }

    public static Format valueOf(String str) {
        return (Format) Enum.valueOf(Format.class, str);
    }

    public static Format[] values() {
        return (Format[]) a.clone();
    }
}
