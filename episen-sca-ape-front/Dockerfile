
FROM node:10-alpine as build

COPY package.json package-lock.json ./

RUN npm install && mkdir /ng-app && mv ./node_modules ./ng-app

WORKDIR /ng-app

COPY . .

RUN npm run ng build --prod --output-path=dist


FROM nginxinc/nginx-unprivileged
LABEL version="2"
LABEL maintainer="andrei.petrov@etu.u-pec.fr"

COPY --from=build /ng-app/dist /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]






