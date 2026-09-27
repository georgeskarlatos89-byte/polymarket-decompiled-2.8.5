package com.polymarket.usviewmodels;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001aB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\rj\u0002\b\u000e¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "ascending", "descending", "toggled", "getToggled", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "Swift_toggled", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsPositionsEventPageSortDirection implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SquadsPositionsEventPageSortDirection[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SquadsPositionsEventPageSortDirection ascending = new SquadsPositionsEventPageSortDirection("ascending", 0, "ascending", null, 2, null);
    public static final SquadsPositionsEventPageSortDirection descending = new SquadsPositionsEventPageSortDirection("descending", 1, "descending", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ SquadsPositionsEventPageSortDirection[] $values() {
        return new SquadsPositionsEventPageSortDirection[]{ascending, descending};
    }

    static {
        SquadsPositionsEventPageSortDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ SquadsPositionsEventPageSortDirection(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native SquadsPositionsEventPageSortDirection Swift_toggled(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SquadsPositionsEventPageSortDirection valueOf(String str) {
        return (SquadsPositionsEventPageSortDirection) Enum.valueOf(SquadsPositionsEventPageSortDirection.class, str);
    }

    public static SquadsPositionsEventPageSortDirection[] values() {
        return (SquadsPositionsEventPageSortDirection[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final SquadsPositionsEventPageSortDirection getToggled() {
        return Swift_toggled(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion implements CaseIterableCompanion<SquadsPositionsEventPageSortDirection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<SquadsPositionsEventPageSortDirection> getAllCases() {
            return ArrayKt.arrayOf(SquadsPositionsEventPageSortDirection.ascending, SquadsPositionsEventPageSortDirection.descending);
        }

        public final SquadsPositionsEventPageSortDirection init(String rawValue) {
            rawValue.getClass();
            if (Intrinsics.areEqual(rawValue, "ascending")) {
                return SquadsPositionsEventPageSortDirection.ascending;
            }
            if (Intrinsics.areEqual(rawValue, "descending")) {
                return SquadsPositionsEventPageSortDirection.descending;
            }
            return null;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private SquadsPositionsEventPageSortDirection(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
