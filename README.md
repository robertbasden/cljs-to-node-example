
# Clojure(Script) -> Node template

## Intro

This is basically just the bits following along with [this](https://lambdaisland.com/blog/2017-05-02-nodejs-scripts-clojurescript) tutorial from [Lambda Island](https://lambdaisland.com/)

## Getting started

- Install [Clojure](https://clojure.org/guides/getting_started)
- Install [Lein](https://leiningen.org/)
- Run `lein install`

## Building

- Run `lein cljsbuild once prod`
- Compiled code output to `dist/index.js`

## Try it

- `cd dist`
- `npm link .`
- `l33t I am a leet hacker` 