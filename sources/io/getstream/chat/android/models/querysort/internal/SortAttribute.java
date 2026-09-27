package io.getstream.chat.android.models.querysort.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ska;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "T", "", "<init>", "()V", Keys.KEY_NAME, "", "getName", "()Ljava/lang/String;", "FieldSortAttribute", "FieldNameSortAttribute", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SortAttribute<T> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;", "T", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", Keys.KEY_NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class FieldNameSortAttribute<T> extends SortAttribute<T> {
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldNameSortAttribute(String str) {
            super(null);
            str.getClass();
            this.name = str;
        }

        public static /* synthetic */ FieldNameSortAttribute copy$default(FieldNameSortAttribute fieldNameSortAttribute, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fieldNameSortAttribute.name;
            }
            return fieldNameSortAttribute.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final FieldNameSortAttribute<T> copy(String name) {
            name.getClass();
            return new FieldNameSortAttribute<>(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof FieldNameSortAttribute) && Intrinsics.areEqual(this.name, ((FieldNameSortAttribute) other).name)) {
                return true;
            }
            return false;
        }

        @Override // io.getstream.chat.android.models.querysort.internal.SortAttribute
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return sv6.n("FieldNameSortAttribute(name=", this.name, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B)\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "T", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "Lska;", "", "field", "", Keys.KEY_NAME, "<init>", "(Lska;Ljava/lang/String;)V", "component1", "()Lska;", "component2", "()Ljava/lang/String;", "copy", "(Lska;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lska;", "getField", "Ljava/lang/String;", "getName", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class FieldSortAttribute<T> extends SortAttribute<T> {
        private final ska field;
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldSortAttribute(ska skaVar, String str) {
            super(null);
            skaVar.getClass();
            str.getClass();
            this.field = skaVar;
            this.name = str;
        }

        public static /* synthetic */ FieldSortAttribute copy$default(FieldSortAttribute fieldSortAttribute, ska skaVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                skaVar = fieldSortAttribute.field;
            }
            if ((i & 2) != 0) {
                str = fieldSortAttribute.name;
            }
            return fieldSortAttribute.copy(skaVar, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ska getField() {
            return this.field;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final FieldSortAttribute<T> copy(ska field, String name) {
            field.getClass();
            name.getClass();
            return new FieldSortAttribute<>(field, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldSortAttribute)) {
                return false;
            }
            FieldSortAttribute fieldSortAttribute = (FieldSortAttribute) other;
            if (Intrinsics.areEqual(this.field, fieldSortAttribute.field) && Intrinsics.areEqual(this.name, fieldSortAttribute.name)) {
                return true;
            }
            return false;
        }

        public final ska getField() {
            return this.field;
        }

        @Override // io.getstream.chat.android.models.querysort.internal.SortAttribute
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.field.hashCode() * 31);
        }

        public String toString() {
            return "FieldSortAttribute(field=" + this.field + ", name=" + this.name + ")";
        }
    }

    public /* synthetic */ SortAttribute(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    private SortAttribute() {
    }
}
