FROM node:13.7 as angularDev

RUN npm install -g @angular/cli@8.3.20

WORKDIR /app

EXPOSE 4200

COPY ./vertualFont /app

CMD ./startupFont.sh