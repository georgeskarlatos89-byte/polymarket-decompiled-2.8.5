package io.intercom.android.sdk.m5.components.avatar;

import com.google.gson.annotations.SerializedName;
import defpackage.ug7;
import defpackage.ww4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarShape {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AvatarShape[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerializedName("circle")
    public static final AvatarShape CIRCLE = new AvatarShape("CIRCLE", 0);

    @SerializedName("squircle")
    public static final AvatarShape SQUIRCLE = new AvatarShape("SQUIRCLE", 1);

    private static final /* synthetic */ AvatarShape[] $values() {
        return new AvatarShape[]{CIRCLE, SQUIRCLE};
    }

    static {
        AvatarShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private AvatarShape(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AvatarShape valueOf(String str) {
        return (AvatarShape) Enum.valueOf(AvatarShape.class, str);
    }

    public static AvatarShape[] values() {
        return (AvatarShape[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion;", "", "<init>", "()V", "fromName", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "shape", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AvatarShape fromName(String shape) {
            Object obj;
            shape.getClass();
            Iterator<E> it = AvatarShape.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (e.o(((AvatarShape) obj).name(), shape, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AvatarShape avatarShape = (AvatarShape) obj;
            if (avatarShape == null) {
                return AvatarShape.CIRCLE;
            }
            return avatarShape;
        }

        private Companion() {
        }
    }
}
