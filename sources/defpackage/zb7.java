package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zb7 extends at0 {
    public final TextView h;
    public final sb7 i;
    public boolean j = true;

    public zb7(TextView textView) {
        this.h = textView;
        this.i = new sb7(textView);
    }

    @Override // defpackage.at0
    public final InputFilter[] d(InputFilter[] inputFilterArr) {
        if (!this.j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof sb7) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            sb7 sb7Var = this.i;
            if (i4 < length2) {
                if (inputFilterArr[i4] == sb7Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = sb7Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.at0
    public final boolean e() {
        return this.j;
    }

    @Override // defpackage.at0
    public final void f(boolean z) {
        if (z) {
            h();
        }
    }

    @Override // defpackage.at0
    public final void g(boolean z) {
        this.j = z;
        h();
        TextView textView = this.h;
        textView.setFilters(d(textView.getFilters()));
    }

    public final void h() {
        TextView textView = this.h;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.j) {
            if (!(transformationMethod instanceof dc7) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new dc7(transformationMethod);
            }
        } else if (transformationMethod instanceof dc7) {
            transformationMethod = ((dc7) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
