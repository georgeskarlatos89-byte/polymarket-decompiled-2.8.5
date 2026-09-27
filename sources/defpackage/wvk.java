package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum wvk {
    GET_REQUEST_STARTED(50),
    GET_REQUEST_ERROR(51),
    GET_REQUEST_SUCCEEDED(52),
    POST_REQUEST_STARTED(53),
    POST_REQUEST_ERROR(54),
    POST_REQUEST_SUCCEEDED(55),
    HTTP_STATUS_FAILED(-1),
    HTTP_STATUS_200(200);

    private final int a;

    wvk(int i) {
        this.a = i;
    }

    public static wvk a(int i) {
        wvk wvkVar = GET_REQUEST_STARTED;
        if (i == wvkVar.a) {
            return wvkVar;
        }
        wvk wvkVar2 = GET_REQUEST_ERROR;
        if (i == wvkVar2.a) {
            return wvkVar2;
        }
        wvk wvkVar3 = GET_REQUEST_SUCCEEDED;
        if (i == wvkVar3.a) {
            return wvkVar3;
        }
        wvk wvkVar4 = POST_REQUEST_STARTED;
        if (i == wvkVar4.a) {
            return wvkVar4;
        }
        wvk wvkVar5 = POST_REQUEST_ERROR;
        if (i == wvkVar5.a) {
            return wvkVar5;
        }
        wvk wvkVar6 = POST_REQUEST_SUCCEEDED;
        if (i == wvkVar6.a) {
            return wvkVar6;
        }
        wvk wvkVar7 = HTTP_STATUS_FAILED;
        if (i == wvkVar7.a) {
            return wvkVar7;
        }
        wvk wvkVar8 = HTTP_STATUS_200;
        if (i == wvkVar8.a) {
            return wvkVar8;
        }
        return null;
    }

    public final int b() {
        return this.a;
    }
}
