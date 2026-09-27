package com.polymarket.usviewmodels;

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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "outcome", "cost", "toWin", "defaultDirection", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "getDefaultDirection", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "Swift_defaultDirection", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsPositionsEventPageSortField implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SquadsPositionsEventPageSortField[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final SquadsPositionsEventPageSortField outcome = new SquadsPositionsEventPageSortField("outcome", 0, "outcome", null, 2, null);
    public static final SquadsPositionsEventPageSortField cost = new SquadsPositionsEventPageSortField("cost", 1, "cost", null, 2, null);
    public static final SquadsPositionsEventPageSortField toWin = new SquadsPositionsEventPageSortField("toWin", 2, "toWin", null, 2, null);

    private static final /* synthetic */ SquadsPositionsEventPageSortField[] $values() {
        return new SquadsPositionsEventPageSortField[]{outcome, cost, toWin};
    }

    static {
        SquadsPositionsEventPageSortField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ SquadsPositionsEventPageSortField(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native SquadsPositionsEventPageSortDirection Swift_defaultDirection(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SquadsPositionsEventPageSortField valueOf(String str) {
        return (SquadsPositionsEventPageSortField) Enum.valueOf(SquadsPositionsEventPageSortField.class, str);
    }

    public static SquadsPositionsEventPageSortField[] values() {
        return (SquadsPositionsEventPageSortField[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final SquadsPositionsEventPageSortDirection getDefaultDirection() {
        return Swift_defaultDirection(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion implements CaseIterableCompanion<SquadsPositionsEventPageSortField> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<SquadsPositionsEventPageSortField> getAllCases() {
            return ArrayKt.arrayOf(SquadsPositionsEventPageSortField.outcome, SquadsPositionsEventPageSortField.cost, SquadsPositionsEventPageSortField.toWin);
        }

        public final SquadsPositionsEventPageSortField init(String rawValue) {
            rawValue.getClass();
            int hashCode = rawValue.hashCode();
            if (hashCode != -1106507950) {
                if (hashCode != 3059661) {
                    if (hashCode == 110522209 && rawValue.equals("toWin")) {
                        return SquadsPositionsEventPageSortField.toWin;
                    }
                    return null;
                }
                if (rawValue.equals("cost")) {
                    return SquadsPositionsEventPageSortField.cost;
                }
                return null;
            }
            if (rawValue.equals("outcome")) {
                return SquadsPositionsEventPageSortField.outcome;
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

    private SquadsPositionsEventPageSortField(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
