package net.uiqui.apptest;

import net.uiqui.embedhttp.api.ContentType;
import net.uiqui.embedhttp.api.HttpRequest;
import net.uiqui.embedhttp.api.HttpResponse;

public class AppAPI {
    public HttpResponse fetch(HttpRequest request) {
        var id = request.getPathParameter("id");
        var name = request.getQueryParameter("name");
        var payload = "Resource ID: " + id + ", Name: " + name;
        return HttpResponse.ok()
                .setBody(ContentType.TEXT_PLAIN, payload);
    }
}
