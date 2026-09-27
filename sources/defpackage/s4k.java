package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class s4k extends r4k {
    public lyd[] a;
    public String b;
    public int c;

    public s4k(s4k s4kVar) {
        this.a = null;
        this.c = 0;
        this.b = s4kVar.b;
        lyd[] lydVarArr = s4kVar.a;
        lyd[] lydVarArr2 = new lyd[lydVarArr.length];
        for (int i = 0; i < lydVarArr.length; i++) {
            lydVarArr2[i] = new lyd(lydVarArr[i]);
        }
        this.a = lydVarArr2;
    }

    public lyd[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(lyd[] lydVarArr) {
        lyd[] lydVarArr2 = this.a;
        if (lydVarArr2 != null && lydVarArr != null && lydVarArr2.length == lydVarArr.length) {
            for (int i = 0; i < lydVarArr2.length; i++) {
                lyd lydVar = lydVarArr2[i];
                char c = lydVar.a;
                lyd lydVar2 = lydVarArr[i];
                if (c == lydVar2.a && lydVar.b.length == lydVar2.b.length) {
                }
            }
            lyd[] lydVarArr3 = this.a;
            for (int i2 = 0; i2 < lydVarArr.length; i2++) {
                lydVarArr3[i2].a = lydVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = lydVarArr[i2].b;
                    if (i3 < fArr.length) {
                        lydVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        lyd[] lydVarArr4 = new lyd[lydVarArr.length];
        for (int i4 = 0; i4 < lydVarArr.length; i4++) {
            lydVarArr4[i4] = new lyd(lydVarArr[i4]);
        }
        this.a = lydVarArr4;
    }

    public s4k() {
        this.a = null;
        this.c = 0;
    }
}
