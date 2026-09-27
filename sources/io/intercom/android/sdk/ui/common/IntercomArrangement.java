package io.intercom.android.sdk.ui.common;

import defpackage.il6;
import defpackage.mk0;
import defpackage.sv6;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/ui/common/IntercomArrangement;", "", "<init>", "()V", "", "itemIndex", "Lmk0;", "itemAtBottom", "(I)Lmk0;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomArrangement {
    public static final int $stable = 0;
    public static final IntercomArrangement INSTANCE = new IntercomArrangement();

    private IntercomArrangement() {
    }

    public final mk0 itemAtBottom(final int itemIndex) {
        return new mk0() { // from class: io.intercom.android.sdk.ui.common.IntercomArrangement$itemAtBottom$1
            @Override // defpackage.mk0
            public void arrange(il6 il6Var, int i, int[] iArr, int[] iArr2) {
                il6Var.getClass();
                iArr.getClass();
                iArr2.getClass();
                int i2 = itemIndex;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    int i7 = i4 + 1;
                    if (i4 == i2) {
                        iArr2[i4] = i - i6;
                    } else {
                        iArr2[i4] = i5;
                        i5 += i6;
                    }
                    i3++;
                    i4 = i7;
                }
            }

            @Override // defpackage.mk0
            /* renamed from: getSpacing-D9Ej5fM */
            public /* bridge */ /* synthetic */ float mo9getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return sv6.o(new StringBuilder("Arrangement#itemAtBottom("), itemIndex, ')');
            }
        };
    }
}
