package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001eB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001f"}, d2 = {"Lcom/polymarket/data/EAvatarFlairTier;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "tier1", "tier2", "tier3", "tier4", "tier5", "usesProminentPositionTag", "", "getUsesProminentPositionTag", "()Z", "Swift_usesProminentPositionTag", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EAvatarFlairTier implements CaseIterable, RawRepresentable<Integer>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EAvatarFlairTier[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EAvatarFlairTier tier1 = new EAvatarFlairTier("tier1", 0, 1, null, 2, null);
    public static final EAvatarFlairTier tier2 = new EAvatarFlairTier("tier2", 1, 2, null, 2, null);
    public static final EAvatarFlairTier tier3 = new EAvatarFlairTier("tier3", 2, 3, null, 2, null);
    public static final EAvatarFlairTier tier4 = new EAvatarFlairTier("tier4", 3, 4, null, 2, null);
    public static final EAvatarFlairTier tier5 = new EAvatarFlairTier("tier5", 4, 5, null, 2, null);
    private final int rawValue;

    private static final /* synthetic */ EAvatarFlairTier[] $values() {
        return new EAvatarFlairTier[]{tier1, tier2, tier3, tier4, tier5};
    }

    static {
        EAvatarFlairTier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EAvatarFlairTier(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native boolean Swift_usesProminentPositionTag(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EAvatarFlairTier valueOf(String str) {
        return (EAvatarFlairTier) Enum.valueOf(EAvatarFlairTier.class, str);
    }

    public static EAvatarFlairTier[] values() {
        return (EAvatarFlairTier[]) $VALUES.clone();
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

    public final boolean getUsesProminentPositionTag() {
        return Swift_usesProminentPositionTag(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EAvatarFlairTier$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/EAvatarFlairTier;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<EAvatarFlairTier> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<EAvatarFlairTier> getAllCases() {
            return ArrayKt.arrayOf(EAvatarFlairTier.tier1, EAvatarFlairTier.tier2, EAvatarFlairTier.tier3, EAvatarFlairTier.tier4, EAvatarFlairTier.tier5);
        }

        public final EAvatarFlairTier init(int rawValue) {
            if (rawValue != 1) {
                if (rawValue != 2) {
                    if (rawValue != 3) {
                        if (rawValue != 4) {
                            if (rawValue != 5) {
                                return null;
                            }
                            return EAvatarFlairTier.tier5;
                        }
                        return EAvatarFlairTier.tier4;
                    }
                    return EAvatarFlairTier.tier3;
                }
                return EAvatarFlairTier.tier2;
            }
            return EAvatarFlairTier.tier1;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Integer getRawValue() {
        return getRawValue();
    }

    private EAvatarFlairTier(String str, int i, int i2, Void r4) {
        this.rawValue = i2;
    }
}
