package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzagi implements zzbsa {
    TEL(0),
    SMS(1),
    CALLTO(2),
    WTAI(3),
    RTSP(4),
    MARKET(5),
    GEO(6),
    SKYPE(7),
    WHATSAPP(8),
    ITMS(20),
    ITMS_BOOKS(9),
    ITMS_BOOKSS(27),
    GLASS(10),
    ITMS_APPS(11),
    ITMS_APPSS(19),
    ITMS_SERVICES(22),
    GOOGLEASSISTANT(12),
    ASSISTANT_SETTINGS(13),
    SSH(14),
    INTENT(15),
    SIP(16),
    GOOGLEHOME(17),
    CHROMECAST(18),
    COMGOOGLECAST(35),
    PAY(21),
    GOOGLEAPP(23),
    CID(24),
    WEBCAL(25),
    YOUTUBE(26),
    FILE(28),
    CONTENT(29),
    HELPFULINTERRUPTION(30),
    GOOGLECHROMEACTION(31),
    GOOGLECHROME(32),
    GOOGLECHROMES(33),
    GOOGLEPHOTOS(34),
    GOOGLEDEVICEPOLICY(36);

    private final int zzL;

    zzagi(int i) {
        this.zzL = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzL);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzL;
    }
}
