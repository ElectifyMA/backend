package com.electify.serializers;

import com.electify.models.dto.response._AbstractResponse;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.List;

public class ListLengthSerializer extends JsonSerializer<List<_AbstractResponse>> {
    @Override
    public void serialize(List<_AbstractResponse> abstractResponses, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(abstractResponses.size());
    }
}
