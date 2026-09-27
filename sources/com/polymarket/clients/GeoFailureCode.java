package com.polymarket.clients;

import com.google.mlkit.common.MlKitException;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001%B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u0002H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u0002H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006&"}, d2 = {"Lcom/polymarket/clients/GeoFailureCode;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "notInitialized", "missingPlugin", "permissionsDenied", "locationTimeout", "bluetoothError", "networkError", "badRequest", "unauthorized", "paymentRequired", "forbidden", "notFound", "rateLimited", "serverError", "providerTimeout", "unknown", "nullToken", "blocked", "stateBlocked", "vpnBlocked", "skipped", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoFailureCode implements RawRepresentable<Integer>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ GeoFailureCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int rawValue;
    public static final GeoFailureCode notInitialized = new GeoFailureCode("notInitialized", 0, 101, null, 2, null);
    public static final GeoFailureCode missingPlugin = new GeoFailureCode("missingPlugin", 1, 102, null, 2, null);
    public static final GeoFailureCode permissionsDenied = new GeoFailureCode("permissionsDenied", 2, 110, null, 2, null);
    public static final GeoFailureCode locationTimeout = new GeoFailureCode("locationTimeout", 3, 120, null, 2, null);
    public static final GeoFailureCode bluetoothError = new GeoFailureCode("bluetoothError", 4, 121, null, 2, null);
    public static final GeoFailureCode networkError = new GeoFailureCode("networkError", 5, 130, null, 2, null);
    public static final GeoFailureCode badRequest = new GeoFailureCode("badRequest", 6, 140, null, 2, null);
    public static final GeoFailureCode unauthorized = new GeoFailureCode("unauthorized", 7, 141, null, 2, null);
    public static final GeoFailureCode paymentRequired = new GeoFailureCode("paymentRequired", 8, 142, null, 2, null);
    public static final GeoFailureCode forbidden = new GeoFailureCode("forbidden", 9, 143, null, 2, null);
    public static final GeoFailureCode notFound = new GeoFailureCode("notFound", 10, 144, null, 2, null);
    public static final GeoFailureCode rateLimited = new GeoFailureCode("rateLimited", 11, 150, null, 2, null);
    public static final GeoFailureCode serverError = new GeoFailureCode("serverError", 12, 160, null, 2, null);
    public static final GeoFailureCode providerTimeout = new GeoFailureCode("providerTimeout", 13, 170, null, 2, null);
    public static final GeoFailureCode unknown = new GeoFailureCode("unknown", 14, 190, null, 2, null);
    public static final GeoFailureCode nullToken = new GeoFailureCode("nullToken", 15, 191, null, 2, null);
    public static final GeoFailureCode blocked = new GeoFailureCode("blocked", 16, 200, null, 2, null);
    public static final GeoFailureCode stateBlocked = new GeoFailureCode("stateBlocked", 17, MlKitException.CODE_SCANNER_CANCELLED, null, 2, null);
    public static final GeoFailureCode vpnBlocked = new GeoFailureCode("vpnBlocked", 18, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, null, 2, null);
    public static final GeoFailureCode skipped = new GeoFailureCode("skipped", 19, 900, null, 2, null);

    private static final /* synthetic */ GeoFailureCode[] $values() {
        return new GeoFailureCode[]{notInitialized, missingPlugin, permissionsDenied, locationTimeout, bluetoothError, networkError, badRequest, unauthorized, paymentRequired, forbidden, notFound, rateLimited, serverError, providerTimeout, unknown, nullToken, blocked, stateBlocked, vpnBlocked, skipped};
    }

    static {
        GeoFailureCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ GeoFailureCode(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static GeoFailureCode valueOf(String str) {
        return (GeoFailureCode) Enum.valueOf(GeoFailureCode.class, str);
    }

    public static GeoFailureCode[] values() {
        return (GeoFailureCode[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // skip.lib.RawRepresentable
    public Integer getRawValue() {
        return Integer.valueOf(this.rawValue);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/GeoFailureCode$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/GeoFailureCode;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GeoFailureCode init(int rawValue) {
            if (rawValue != 101) {
                if (rawValue != 102) {
                    if (rawValue != 110) {
                        if (rawValue != 130) {
                            if (rawValue != 150) {
                                if (rawValue != 160) {
                                    if (rawValue != 170) {
                                        if (rawValue != 900) {
                                            if (rawValue != 120) {
                                                if (rawValue != 121) {
                                                    if (rawValue != 190) {
                                                        if (rawValue != 191) {
                                                            switch (rawValue) {
                                                                case 140:
                                                                    return GeoFailureCode.badRequest;
                                                                case 141:
                                                                    return GeoFailureCode.unauthorized;
                                                                case 142:
                                                                    return GeoFailureCode.paymentRequired;
                                                                case 143:
                                                                    return GeoFailureCode.forbidden;
                                                                case 144:
                                                                    return GeoFailureCode.notFound;
                                                                default:
                                                                    switch (rawValue) {
                                                                        case 200:
                                                                            return GeoFailureCode.blocked;
                                                                        case MlKitException.CODE_SCANNER_CANCELLED /* 201 */:
                                                                            return GeoFailureCode.stateBlocked;
                                                                        case MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED /* 202 */:
                                                                            return GeoFailureCode.vpnBlocked;
                                                                        default:
                                                                            return null;
                                                                    }
                                                            }
                                                        }
                                                        return GeoFailureCode.nullToken;
                                                    }
                                                    return GeoFailureCode.unknown;
                                                }
                                                return GeoFailureCode.bluetoothError;
                                            }
                                            return GeoFailureCode.locationTimeout;
                                        }
                                        return GeoFailureCode.skipped;
                                    }
                                    return GeoFailureCode.providerTimeout;
                                }
                                return GeoFailureCode.serverError;
                            }
                            return GeoFailureCode.rateLimited;
                        }
                        return GeoFailureCode.networkError;
                    }
                    return GeoFailureCode.permissionsDenied;
                }
                return GeoFailureCode.missingPlugin;
            }
            return GeoFailureCode.notInitialized;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Integer getRawValue() {
        return getRawValue();
    }

    private GeoFailureCode(String str, int i, int i2, Void r4) {
        this.rawValue = i2;
    }
}
