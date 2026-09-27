package com.polymarket.data;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/ESquadInviteTokenState;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "valid", "revoked", "alreadyRedeemed", "squadDeleted", "squadFull", "unresolvable", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadInviteTokenState implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ESquadInviteTokenState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ESquadInviteTokenState valid = new ESquadInviteTokenState("valid", 0, "valid", null, 2, null);
    public static final ESquadInviteTokenState revoked = new ESquadInviteTokenState("revoked", 1, "revoked", null, 2, null);
    public static final ESquadInviteTokenState alreadyRedeemed = new ESquadInviteTokenState("alreadyRedeemed", 2, "alreadyRedeemed", null, 2, null);
    public static final ESquadInviteTokenState squadDeleted = new ESquadInviteTokenState("squadDeleted", 3, "squadDeleted", null, 2, null);
    public static final ESquadInviteTokenState squadFull = new ESquadInviteTokenState("squadFull", 4, "squadFull", null, 2, null);
    public static final ESquadInviteTokenState unresolvable = new ESquadInviteTokenState("unresolvable", 5, "unresolvable", null, 2, null);

    private static final /* synthetic */ ESquadInviteTokenState[] $values() {
        return new ESquadInviteTokenState[]{valid, revoked, alreadyRedeemed, squadDeleted, squadFull, unresolvable};
    }

    static {
        ESquadInviteTokenState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ESquadInviteTokenState(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ESquadInviteTokenState valueOf(String str) {
        return (ESquadInviteTokenState) Enum.valueOf(ESquadInviteTokenState.class, str);
    }

    public static ESquadInviteTokenState[] values() {
        return (ESquadInviteTokenState[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquadInviteTokenState$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESquadInviteTokenState;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ESquadInviteTokenState init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case 111972348:
                    if (!rawValue.equals("valid")) {
                        return null;
                    }
                    return ESquadInviteTokenState.valid;
                case 521942476:
                    if (rawValue.equals("unresolvable")) {
                        return ESquadInviteTokenState.unresolvable;
                    }
                    return null;
                case 1100137118:
                    if (rawValue.equals("revoked")) {
                        return ESquadInviteTokenState.revoked;
                    }
                    return null;
                case 1300535785:
                    if (rawValue.equals("squadFull")) {
                        return ESquadInviteTokenState.squadFull;
                    }
                    return null;
                case 1423393407:
                    if (rawValue.equals("squadDeleted")) {
                        return ESquadInviteTokenState.squadDeleted;
                    }
                    return null;
                case 1445792691:
                    if (rawValue.equals("alreadyRedeemed")) {
                        return ESquadInviteTokenState.alreadyRedeemed;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private ESquadInviteTokenState(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
