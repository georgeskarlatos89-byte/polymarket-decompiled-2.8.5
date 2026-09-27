package skip.foundation;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lskip/foundation/Unicode;", "", "<init>", "()V", "ASCII", "UTF16", "UTF32", "UTF8", "ParseResult", "Scalar", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Unicode {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lskip/foundation/Unicode$ASCII;", "", "<init>", "()V", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ASCII {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lskip/foundation/Unicode$UTF16;", "", "<init>", "()V", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UTF16 {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lskip/foundation/Unicode$UTF32;", "", "<init>", "()V", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UTF32 {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lskip/foundation/Unicode$UTF8;", "", "<init>", "()V", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UTF8 {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lskip/foundation/Unicode$ParseResult;", "T", "", "<init>", "()V", "ValidCase", "EmptyInputCase", "ErrorCase", "Companion", "Lskip/foundation/Unicode$ParseResult$EmptyInputCase;", "Lskip/foundation/Unicode$ParseResult$ErrorCase;", "Lskip/foundation/Unicode$ParseResult$ValidCase;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class ParseResult<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final ParseResult emptyInput = new EmptyInputCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lskip/foundation/Unicode$ParseResult$EmptyInputCase;", "Lskip/foundation/Unicode$ParseResult;", "", "<init>", "()V", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class EmptyInputCase extends ParseResult {
            public EmptyInputCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lskip/foundation/Unicode$ParseResult$ErrorCase;", "Lskip/foundation/Unicode$ParseResult;", "", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "length", "getLength", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class ErrorCase extends ParseResult {
            private final int associated0;
            private final int length;

            public ErrorCase(int i) {
                super(null);
                this.associated0 = i;
                this.length = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }

            public final int getLength() {
                return this.length;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lskip/foundation/Unicode$ParseResult$ValidCase;", "T", "Lskip/foundation/Unicode$ParseResult;", "associated0", "<init>", "(Ljava/lang/Object;)V", "getAssociated0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class ValidCase<T> extends ParseResult<T> {
            private final T associated0;

            public ValidCase(T t) {
                super(null);
                this.associated0 = t;
            }

            public final T getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ ParseResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ ParseResult access$getEmptyInput$cp() {
            return emptyInput;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006¢\u0006\u0002\u0010\bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lskip/foundation/Unicode$ParseResult$Companion;", "", "<init>", "()V", "valid", "Lskip/foundation/Unicode$ParseResult;", "T", "associated0", "(Ljava/lang/Object;)Lskip/foundation/Unicode$ParseResult;", "emptyInput", "", "getEmptyInput", "()Lskip/foundation/Unicode$ParseResult;", "error", "length", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ParseResult error(int length) {
                return new ErrorCase(length);
            }

            public final ParseResult getEmptyInput() {
                return ParseResult.access$getEmptyInput$cp();
            }

            public final <T> ParseResult<T> valid(T associated0) {
                return new ValidCase(associated0);
            }

            private Companion() {
            }
        }

        private ParseResult() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0014B\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0016\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lskip/foundation/Unicode$Scalar;", "Lskip/lib/RawRepresentable;", "Lkotlin/UInt;", "", "rawValue", "unusedp_0", "", "<init>", "(ILjava/lang/Void;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawValue-pVg5ArA", "()I", "I", "compareTo", "", "other", "equals", "", "", "hashCode", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Scalar implements RawRepresentable<UInt>, Comparable<Scalar> {
        private final int rawValue;

        public /* synthetic */ Scalar(int i, Void r2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : r2, null);
        }

        private static final boolean compareTo$islessthan(Scalar scalar, Scalar scalar2) {
            if (Integer.compareUnsigned(scalar.getRawValue(), scalar2.getRawValue()) < 0) {
                return true;
            }
            return false;
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Scalar other) {
            other.getClass();
            if (Intrinsics.areEqual(this, other)) {
                return 0;
            }
            if (compareTo$islessthan(this, other)) {
                return -1;
            }
            return 1;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Scalar) || getRawValue() != ((Scalar) other).getRawValue()) {
                return false;
            }
            return true;
        }

        @Override // skip.lib.RawRepresentable
        public /* synthetic */ UInt getRawValue() {
            return new UInt(getRawValue());
        }

        /* renamed from: getRawValue-pVg5ArA, reason: not valid java name and from getter */
        public int getRawValue() {
            return this.rawValue;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, new UInt(getRawValue()));
        }

        public /* synthetic */ Scalar(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private Scalar(int i, Void r2) {
            this.rawValue = i;
        }

        public /* synthetic */ Scalar(int i, Void r2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, r2);
        }

        private Scalar(int i) {
            this.rawValue = i;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Scalar scalar) {
            return compareTo2(scalar);
        }
    }
}
