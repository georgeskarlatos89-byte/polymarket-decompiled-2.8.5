package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 )2\u00020\u0001:\u0006$%&'()B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u0015J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0011H\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e\u0082\u0001\u0005*+,-.¨\u0006/"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "bool", "", "getBool", "()Ljava/lang/Boolean;", "Swift_bool", "className", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "string", "getString", "()Ljava/lang/String;", "Swift_string", "int", "", "getInt", "()Ljava/lang/Integer;", "Swift_int", "(Ljava/lang/String;)Ljava/lang/Integer;", "double", "", "getDouble", "()Ljava/lang/Double;", "Swift_double", "(Ljava/lang/String;)Ljava/lang/Double;", "json", "getJson", "Swift_json", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "BoolCase", "StringCase", "IntCase", "DoubleCase", "JsonCase", "Companion", "Lcom/polymarket/data/EFeatureFlagValue$BoolCase;", "Lcom/polymarket/data/EFeatureFlagValue$DoubleCase;", "Lcom/polymarket/data/EFeatureFlagValue$IntCase;", "Lcom/polymarket/data/EFeatureFlagValue$JsonCase;", "Lcom/polymarket/data/EFeatureFlagValue$StringCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EFeatureFlagValue implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$BoolCase;", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "equals", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BoolCase extends EFeatureFlagValue {
        private final boolean associated0;

        public BoolCase(boolean z) {
            super(null);
            this.associated0 = z;
        }

        public boolean equals(Object other) {
            if (!(other instanceof BoolCase) || this.associated0 != ((BoolCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, Boolean.valueOf(this.associated0));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$DoubleCase;", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DoubleCase extends EFeatureFlagValue {
        private final double associated0;

        public DoubleCase(double d) {
            super(null);
            this.associated0 = d;
        }

        public boolean equals(Object other) {
            if (!(other instanceof DoubleCase) || this.associated0 != ((DoubleCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final double getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, Double.valueOf(this.associated0));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$IntCase;", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "equals", "", "other", "", "hashCode", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IntCase extends EFeatureFlagValue {
        private final int associated0;

        public IntCase(int i) {
            super(null);
            this.associated0 = i;
        }

        public boolean equals(Object other) {
            if (!(other instanceof IntCase) || this.associated0 != ((IntCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final int getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, Integer.valueOf(this.associated0));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$JsonCase;", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class JsonCase extends EFeatureFlagValue {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof JsonCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((JsonCase) other).associated0);
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$StringCase;", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StringCase extends EFeatureFlagValue {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof StringCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((StringCase) other).associated0);
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    public /* synthetic */ EFeatureFlagValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Boolean Swift_bool(String className);

    private final native Double Swift_double(String className);

    private final native Integer Swift_int(String className);

    private final native String Swift_json(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_string(String className);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final Boolean getBool() {
        return Swift_bool(getClass().getName());
    }

    public final Double getDouble() {
        return Swift_double(getClass().getName());
    }

    public final Integer getInt() {
        return Swift_int(getClass().getName());
    }

    public final String getJson() {
        return Swift_json(getClass().getName());
    }

    public final String getString() {
        return Swift_string(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/EFeatureFlagValue$Companion;", "", "<init>", "()V", "bool", "Lcom/polymarket/data/EFeatureFlagValue;", "associated0", "", "string", "", "int", "", "double", "", "json", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EFeatureFlagValue bool(boolean associated0) {
            return new BoolCase(associated0);
        }

        /* renamed from: double, reason: not valid java name */
        public final EFeatureFlagValue m39double(double associated0) {
            return new DoubleCase(associated0);
        }

        /* renamed from: int, reason: not valid java name */
        public final EFeatureFlagValue m40int(int associated0) {
            return new IntCase(associated0);
        }

        public final EFeatureFlagValue json(String associated0) {
            associated0.getClass();
            return new JsonCase(associated0);
        }

        public final EFeatureFlagValue string(String associated0) {
            associated0.getClass();
            return new StringCase(associated0);
        }

        private Companion() {
        }
    }

    private EFeatureFlagValue() {
    }
}
